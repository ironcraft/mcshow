package fr.ironcraft.mcshow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.lwjgl.Sys;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import fr.ironcraft.mcshow.effects.EffectInfos;
import fr.ironcraft.mcshow.effects.RayParameters;
import fr.ironcraft.mcshow.effects.TesterParameters;

public class Test
{
    public static void main(String[] args)
    {
        Map<Integer, List<EffectInfos>> map = new HashMap<Integer, List<EffectInfos>>();
        
        map.put(0, Arrays.asList(new EffectInfos("Tester", new TesterParameters(8, 9, 8, 123)), new EffectInfos("Ray", new RayParameters(0.0f, 9.345f, 8, 123, 12345467))));
        
        ShowInfos showInfos = new ShowInfos("show de test", map);
        
        Gson gson = (new GsonBuilder()).registerTypeAdapter(EffectInfos.class, new EffectInfos.Deserializer()).create();
        
        String json;
        
        System.out.println(json = gson.toJson(showInfos));
        
        ShowInfos showInfos2 = gson.fromJson(json, ShowInfos.class);
        
        System.out.println(showInfos2.toString());
    }
}
