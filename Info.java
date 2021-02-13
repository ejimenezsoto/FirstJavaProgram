public class Info {
    public String getInfo() {
    String newLine = System.getProperty("line.separator");

    String str1 = "My name is Enzo";
    str1 += '\n';
    String str2 = "I am 30 years old";
    str2 += '\n';
    String str3 = "My hometown is San Jose, CA";

    return str1 + str2 + str3;
    }
}