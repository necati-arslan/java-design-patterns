package com.neco;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MediaPlayer media1 = new Music();
        MediaPlayer media2 = new Podcast();

        media1.play(); // Output: Playing music
        media2.play(); // Output: Playing podcast

        System.out.println("hello");
    }
}
