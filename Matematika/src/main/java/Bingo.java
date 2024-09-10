/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MRvL
 */
public class Bingo {
    String name;

    public Bingo(String name) {
        this.name = name;
    }

    public void sing() {
        String verse = "There was a farmer who had a dog,\nAnd " + name + " was his name-o.\n";
        String claps = name + " was his name-o.\n";

        System.out.println(verse);
        System.out.println(claps);
        System.out.println(verse);
        System.out.println(claps);
        System.out.println(verse);
        System.out.println("B-I-N-G-O\nB-I-N-G-O\n" + claps);
        System.out.println(verse);
        System.out.println("(clap)-I-N-G-O\n(clap)-I-N-G-O\n(clap)-I-N-G-O\n" + claps);
        System.out.println(verse);
        System.out.println("(clap)-(clap)-N-G-O\n(clap)-(clap)-N-G-O\n(clap)-(clap)-N-G-O\n" + claps);
        System.out.println(verse);
        System.out.println("(clap)-(clap)-(clap)-G-O\n(clap)-(clap)-(clap)-G-O\n(clap)-(clap)-(clap)-G-O\n" + claps);
        System.out.println(verse);
        System.out.println("(clap)-(clap)-(clap)-(clap)-O\n(clap)-(clap)-(clap)-(clap)-O\n(clap)-(clap)-(clap)-(clap)-O\n" + claps);
        System.out.println(verse);
    }
}
