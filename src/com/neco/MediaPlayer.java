package com.neco;


// Medya çalma arayüzü
public interface MediaPlayer {
    void play(); // Medyayı çalma metodu
}

// Müzik sınıfı
 class Music implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("Playing music");
        // Müzik çalma işlemleri burada gerçekleştirilir
    }
}

// Podcast sınıfı
 class Podcast implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("Playing podcast");
        // Podcast çalma işlemleri burada gerçekleştirilir
    }
}


