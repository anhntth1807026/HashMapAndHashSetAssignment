package javaio;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainThread {
    private static Video[] list;

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/main/resources/tomandjerry.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            if (count == 0) {
                count++;
                continue;
            }
            System.out.println(line);
            String[] splitted = line.split("\\s{2,}");
            if (splitted.length == 4) {
                String day = splitted[0];
                String id = splitted[1];
                String title = splitted[2];
                String view = splitted[3];
                System.out.println("day: " + day);
                System.out.println("id: " + id);
                System.out.println("title: " + title);
                System.out.println("view: " + view);
            }
            count++;
        }
        HashMap<String, ViewCount> statistic = new HashMap<String, ViewCount>();
        for (Video vid : list
        ) {
            double currentViewCount = 0;
            if (statistic.containsKey(vid.getId())) {
                ViewCount viewCount = statistic.get(vid.getId());
                currentViewCount = viewCount.getView();
            }
            currentViewCount += vid.getView();
            ViewCount viewCount = new ViewCount(vid.getId(), vid.getTitle(), currentViewCount);
            statistic.put(vid.getId(), viewCount);
        }
        for (String id : statistic.keySet()
        ) {
            System.out.println(id);
            ViewCount viewCount = statistic.get(id);
            System.out.println(viewCount.getTitle());
            System.out.println(viewCount.getView());
        }
    }
}
