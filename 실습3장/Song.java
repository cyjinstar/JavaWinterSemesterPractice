public class Song {

  String title;
  String artist;
  int year;
  String country;

  void show() {
    System.out.println(
      year + "년 " + country + "국적의 " + artist + "가 부른 " + title
    );
  }

  public Song() {
    this(null, null, 0, null);
  }

  public Song(String title, String artist, int year, String country) {
    this.title = title;
    this.artist = artist;
    this.year = year;
    this.country = country;
  }

  public static void main(String[] args) {
    Song dancingQueen = new Song("Dancing Queen", "ABBA", 1978, "Sweden");
    dancingQueen.show();
  }
}
