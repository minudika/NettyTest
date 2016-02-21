import java.util.Date;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

public class TimeClientHandler extends SimpleChannelHandler {
	@Override
	public void messageReceived(ChannelHandlerContext ctx,MessageEvent e){
		ChannelBuffer buf = (ChannelBuffer) e.getMessage();
		long currentTimeMillis = buf.readInt()*1000L;
		System.out.println(new Date(currentTimeMillis));
		e.getChannel().close();
	}

}
