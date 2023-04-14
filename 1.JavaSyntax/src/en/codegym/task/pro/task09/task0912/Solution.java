package en.codegym.task.pro.task09.task0912;

/* 
URL validation
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.us", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domainExtension = checkDomainExtension(url);

            System.out.println("URL address: " + url + ", network protocol - " + protocol + ", domain extension - " + domainExtension);
        }
    }

    public static String checkProtocol(String url) {
        if (!url.contains(":")){return "unknown";}
        String protocol = url.substring(0,url.indexOf(":"));
        return protocol ;
    }

    public static String checkDomainExtension(String url) {
        if (!url.contains(".")){return "unknown";}
        String extention = url.substring(url.indexOf(".")+1,url.length());
        if (extention.equals("com")||extention.equals("net")||extention.equals("org")||extention.equals("us")){
            return extention;
        }
        else {return "unknown";}

    }
}
