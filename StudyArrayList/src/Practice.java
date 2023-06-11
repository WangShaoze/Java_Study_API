import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        String all_string = """
                One of the biggest concerns with AI is the potential for misuse. Just like any other technology, AI can be used for malicious purposes, such as cyber attacks, theft, and surveillance
                """;
        ArrayList<String> arrayList = new ArrayList<>();
        String[] array = all_string.split(" ");
        for (int i=0; i<array.length;i++){
            String s = array[i];
            s = s.trim();
            s = s.replace(",", "");
            s = s.replace(".", "");

            char ch = s.charAt(0);
            if (ch>='A'&&ch<'Z'){
                if (s.charAt(1)>='a'&&s.charAt(1)<'z'){
                    s = s.toLowerCase();
                }
            }
            arrayList.add(s);
        }
        System.out.println(arrayList);

        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
