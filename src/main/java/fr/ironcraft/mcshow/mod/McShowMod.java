package fr.ironcraft.mcshow.mod;

import org.apache.logging.log4j.Logger;

import fr.ironcraft.mcshow.table.BlockShowTable;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@Mod(modid = McShowMod.MODID)
public class McShowMod
{
    public static final String MODID = "mcshow";

    @Instance(MODID)
    public static McShowMod instance;
    public static Logger logger;
    
    @SidedProxy(clientSide = "fr.ironcraft.mcshow.mod.McShowClient", serverSide = "fr.ironcraft.mcshow.mod.McShowServer")
    public static McShowCommon proxy;
    
    public static Block showTable;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        showTable = new BlockShowTable();
        GameRegistry.registerBlock(showTable, "show_table");
    }
    
    
}
