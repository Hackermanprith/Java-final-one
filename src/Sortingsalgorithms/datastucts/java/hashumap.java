package Sortingsalgorithms.datastucts.java;

import java.io.*;
import java.util.HashMap;

public class hashumap {
    @SuppressWarnings("depreciation")
    public static void main(String[]args) throws IOException {
        HashMap <String,Integer> hm = new HashMap<String,Integer>();
        hm.put("Satwik",1);
        hm.put("Sreejit",2);
        hm.put("Swarnava",3);
        System.out.println(hm.size());
        hm.get("Satwik");
        hm.get(2);
        hm.remove("Satwik");
        hm.forEach((k,v)->System.out.println(k+" "+v));
        for(String key:hm.keySet()){
            System.out.println(key);
        }
        //no duplicates are stored
        //items are not stored in order but on the basis of hash
        hm.putIfAbsent("Satwik", 1);
        hm.replace("Satwik", 1, 2);
        hm.forEach((k,v)->System.out.println(k+" "+v));
        HashMap <String,String> scd = new HashMap<String,String>();
        BufferedWriter bw = new BufferedWriter(new FileWriter("mukhene.txt"));
        bw.write("Sanu Ashmit");
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("mukhene.txt"));
        String line = br.readLine();
        while(line!=null){
            String []words = line.split(" ");
            for (String word:words) {
                if(scd.containsKey(word)){
                    scd.put(word,word+1);
                }
                else{
                    scd.put(word,words[1]);
                }
            }
            line = br.readLine();
        }
        scd.forEach((k,v)->System.out.println(k+"mukhe ne of "+v));

        //hm.replace(2,"Satwik","Sriniwas");
        //last line will not work as you can only replace by key not value

    }
}
