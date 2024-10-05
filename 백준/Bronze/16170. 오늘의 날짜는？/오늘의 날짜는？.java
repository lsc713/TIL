import java.time.Clock;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now(Clock.systemUTC()).getYear());
        System.out.println(LocalDateTime.now(Clock.systemUTC()).getMonthValue());
        System.out.println(LocalDateTime.now(Clock.systemUTC()).getDayOfMonth());
    }
}