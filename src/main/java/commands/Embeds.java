package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class Embeds extends ListenerAdapter {


    public void onMessageReceived(MessageReceivedEvent event) {
        String prefix = "+";

        Message message = event.getMessage();
        String msg = message.getContentDisplay();
        EmbedBuilder embed = new EmbedBuilder();

        if (event.isFromType(ChannelType.TEXT)) {

            if (msg.equalsIgnoreCase(prefix +"help")) {

                embed.setAuthor(null, null, null);
                embed.setTitle("Asthetiones Commands");
                embed.setColor(Color.pink);
                embed.setDescription("+ and the command name to trigger the command.");
                embed.addField("Informaton", "owner", true);
                embed.addField("Fun", "ping, ravedog", true);
                embed.addField("Moderation", "kick", true);
                message.getChannel().sendMessage(embed.build()).complete();

            } else if (msg.equalsIgnoreCase(prefix + "owner")) {

                embed.setTitle("Asthetiones");
                embed.setThumbnail("https://cdn.discordapp.com/emojis/549677453266649108.gif?v=1");
                embed.setDescription("Creation date: 09/04/19");
                embed.addField("NotAnna", "https://github.com/AnnaStGermain", true);
                message.getChannel().sendMessage(embed.build()).complete();

            }
        }
    }
}
