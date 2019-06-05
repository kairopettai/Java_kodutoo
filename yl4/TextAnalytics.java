import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

class yl4 {
    String input;
    String path;
    String file_content;
    String[] array_of_words;
    HashMap<String, Integer> counter = new HashMap<String, Integer>();

    public TextAnalytics(String path) {
        this.path = path;
        this.read_file();
        this.split_words_into_pieces();
        this.turn_words_to_lowercase();
        this.count_words();
    }

    public void read_file() {
        Path file_path = Paths.get(this.path);
        try {
            byte[] file_content_in_bytes = Files.readAllBytes(file_path);
            String file_content = new String(file_content_in_bytes, StandardCharsets.UTF_8);
            this.file_content = file_content;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void split_words_into_pieces() {
        String[] array_of_words = this.file_content.split(" ");
        this.array_of_words = array_of_words;
    }

    public void turn_words_to_lowercase() {
        this.words.replaceAll(String::toLowerCase);
    }

    public int count_words(int number){
        int count = 0;
        for (String word : this.words) {
            if(word.length() > number){
                count++;
            }
        }
    }
}