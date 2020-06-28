/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_webservice;

import java.util.List;
import net.yandex.speller.services.spellservice.*;

/**
 *
 * @author Alex
 */
public class Ex3_webservice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpellService factory = new SpellService();
        SpellServiceSoap proxy = factory.getSpellServiceSoap();
        CheckTextRequest in = new CheckTextRequest();
        CheckTextResponse out = null;
        
        in.setText("i like javaz");
        out = proxy.checkText(in);
        SpellResult sr = out.getSpellResult();
        List<SpellError> erList = sr.getError();
        
        for(SpellError er : erList) {
            System.out.println(er.getWord());
            List<String> words = er.getS();
            for (String s : words)
                System.out.println(s);
        }
        
    }
    
}
