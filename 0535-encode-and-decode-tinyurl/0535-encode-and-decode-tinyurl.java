public class Codec {
    HashMap<String,String> encodemap;
    HashMap<String,String> decodemap;
    String s;
    int n;
    
    Codec(){
        encodemap=new HashMap<>();
        decodemap=new HashMap<>();
        n=0;
        s="http://tinyurl.com/";
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(encodemap.containsKey(longUrl))
            return encodemap.get(longUrl);
        String shortUrl=s+Integer.toString(n);
        n++;
        encodemap.put(longUrl,shortUrl);
        decodemap.put(shortUrl,longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return decodemap.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));