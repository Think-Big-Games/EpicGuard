package me.ishift.epicguard.core.config;

import org.diorite.cfg.annotations.*;
import org.diorite.cfg.annotations.defaults.CfgDelegateDefault;

import java.util.Arrays;
import java.util.List;

@CfgClass(name = "MessagesConfiguration")
@CfgDelegateDefault("{new}")
@CfgComment("███████╗██████╗ ██╗ ██████╗ ██████╗ ██╗   ██╗ █████╗ ██████╗ ██████╗")
@CfgComment("██╔════╝██╔══██╗██║██╔════╝██╔════╝ ██║   ██║██╔══██╗██╔══██╗██╔══██╗")
@CfgComment("█████╗  ██████╔╝██║██║     ██║  ███╗██║   ██║███████║██████╔╝██║  ██║")
@CfgComment("██╔══╝  ██╔═══╝ ██║██║     ██║   ██║██║   ██║██╔══██║██╔══██╗██║  ██║")
@CfgComment("███████╗██║     ██║╚██████╗╚██████╔╝╚██████╔╝██║  ██║██║  ██║██████╔╝")
@CfgComment("╚══════╝╚═╝     ╚═╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝")
@CfgComment("You are running EpicGuard V5-NEON")
@CfgComment("Created by iShift (Discord: iShift#0524)")
@CfgComment("SpigotMC: https://www.spigotmc.org/resources/72369/")
@CfgComment("Support Discord: https://discord.gg/VkfhFCv")
@CfgComment(" ")
public class MessagesConfiguration {

    @CfgComment("Prefix of all messages sent by the plugin.")
    @CfgName("prefix")
    @CfgStringStyle(CfgStringStyle.StringStyle.ALWAYS_QUOTED)
    public String prefix = "&8[&2EpicGuard&8] &7";

    @CfgName("no-permission")
    public String noPermission = "&cYou don't have permission for this command!";

    @CfgName("wrong-usage")
    public String usage = "&cCorrect usage: &6{USAGE}";

    @CfgName("whitelisted")
    public String whitelisted = "&7Succesfully whitelisted address &a{IP}!";

    @CfgName("blacklisted")
    public String blacklisted = "&7Succesfully whitelisted address &a{IP}!";

    @CfgName("reload")
    public String reload = "&7Succesfully reloaded config and messages!";

    @CfgName("kick-message-geo")
    @CfgCollectionStyle(CfgCollectionStyle.CollectionStyle.ALWAYS_NEW_LINE)
    public List<String> kickMessageGeo = Arrays.asList(
            "&8[&2EpicGuard&8]",
            "&7You have been kicked by our &aantibot protection&7.",
            "&7Details: &cYour country/city is not allowed on this server.");

    @CfgName("kick-message-blacklist")
    @CfgCollectionStyle(CfgCollectionStyle.CollectionStyle.ALWAYS_NEW_LINE)
    public List<String> kickMessageBlacklist = Arrays.asList(
            "&8[&2EpicGuard&8]",
            "&7You have been kicked by our &aantibot protection&7.",
            "&7Details: &cYour IP address is blacklisted on this server.");

    @CfgName("kick-message-blacklist")
    @CfgCollectionStyle(CfgCollectionStyle.CollectionStyle.ALWAYS_NEW_LINE)
    public List<String> kickMessageAttack = Arrays.asList(
            "&8[&2EpicGuard&8]",
            "&7You have been kicked by our &aantibot protection&7.",
            "&7Details: &cServer is under attack, please wait some seconds before joining.");
}