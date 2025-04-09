package _05ClassesUtilitarias._05JavaTime._04Instant;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantAula91 {
    public static void main(String[] args) {

        Instant agora = Instant.now();
        System.out.println(agora);
        System.out.println(LocalDateTime.now());

        System.out.println(agora.getEpochSecond());
        System.out.println(agora.getNano());

        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3,0));
        System.out.println(Instant.ofEpochSecond(3,1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3,-1_000_000_000));
    }
}
