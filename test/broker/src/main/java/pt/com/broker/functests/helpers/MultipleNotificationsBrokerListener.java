package pt.com.broker.functests.helpers;

import pt.com.broker.client.nio.events.NotificationListenerAdapter;
import pt.com.broker.client.nio.server.HostInfo;
import pt.com.broker.types.NetAction;
import pt.com.broker.types.NetNotification;

import java.util.ArrayList;
import java.util.List;

public class MultipleNotificationsBrokerListener extends NotificationListenerAdapter
{

	private NetAction.DestinationType destinationType;
	private List<NetNotification> list;
	private int expectedNotifications;
	private SetValueFuture<List<NetNotification>> value = new SetValueFuture<List<NetNotification>>();

	public MultipleNotificationsBrokerListener(NetAction.DestinationType destinationType, int expectedNotifications)
	{
		this.destinationType = destinationType;
		this.expectedNotifications = expectedNotifications;
		this.list = new ArrayList<>(expectedNotifications);
		//this.list = new CopyOnWriteArrayList<NetNotification>();
	}

    @Override
	public boolean onMessage(NetNotification message, HostInfo host)
	{

        System.out.println("OnMessage :" + message.getMessage().getMessageId());


		synchronized (list)
		{
			list.add( message);
			if (list.size() == expectedNotifications)
			{
				value.set(list);
			}
		}

        return true;
	}

	public SetValueFuture<List<NetNotification>> getFuture()
	{
		return value;
	}

}