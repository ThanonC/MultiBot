package net.thanon.Discord;

import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;
import net.thanon.Utils.Config;

public class Bot {
    public Bot() throws InterruptedException {
         JDA jda = JDABuilder.createDefault(new Config().getString("discord.bot.token"))
                .enableIntents(GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_MEMBERS, GatewayIntent.MESSAGE_CONTENT)
                .addEventListeners(new Listener()).build().awaitReady();

        CommandListUpdateAction commands = jda.updateCommands();

        commands.addCommands(
                Commands.slash("link", "Gives you a list of every link where Thanon can be found (not accurate at the moment)")
        ).queue();
    }
}
