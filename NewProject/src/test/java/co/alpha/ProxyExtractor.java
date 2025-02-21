//package co.alpha;
//import java.io.*;
//import java.util.HashSet;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import java.util.Set;
//
//public class ProxyExtractor {
//    public static void main(String[] args) {
//        String inputFile = "C:/Users/hp/Desktop/output.log";
//        String outputFile = "C:/Users/hp/Desktop/result.txt";
//        String searchKeyword = "Trying with proxy:";
//        
//        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
//            
//            String line;
//            int count = 1;
//            Pattern pattern = Pattern.compile("Trying with proxy:\\s*(\\d+\\.\\d+\\.\\d+\\.\\d+:\\d+)");
//            Set<String> uniqueProxies = new HashSet<>();
//            
//            while ((line = reader.readLine()) != null) {
//                if (line.contains(searchKeyword)) {
//                    Matcher matcher = pattern.matcher(line);
//                    if (matcher.find()) {
//                        String proxyInfo = matcher.group(1);
//                        // Only write if this proxy hasn't been seen before
//                        if (uniqueProxies.add(proxyInfo)) {  // add() returns true if the element wasn't already present
//                            writer.write(count + ".Trying with proxy: " + proxyInfo);
//                            writer.newLine();
//                            count++;
//                        }
//                    }
//                }
//            }
//            System.out.println("Filtered data saved to " + outputFile);
//            System.out.println("Total unique proxies found: " + (count - 1));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}