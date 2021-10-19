package com.company;

public class Main {
    public static void main(String[] args) {
        String text = "The UEFA Champions League (abbreviated as UCL) is an annual club football competition organised by the Union of European Football Associations (UEFA) and contested by top-division European clubs, deciding the competition winners through a round robin group stage to qualify for a double-legged knockout format, and a single leg final." 
          +      " It is one of the most prestigious football tournaments in the world and the most prestigious club competition in European football, played by the national league champions (and, for some nations, one or more runners-up) of their national associations." 
          +"Introduced in 1955 as the Coupe des Clubs Champions Européens (French for European Champion Clubs' Cup), and commonly known as the European Cup, it was initially a straight knockout tournament open only to the champions of Europe's domestic leagues, with its winner reckoned as the European club champion. The competition took on its current name in 1992, adding a round-robin group stage in 1991 and allowing multiple entrants from certain countries since 1997.[1] It has since been expanded, and while most of Europe's national leagues can still only enter their champion, the strongest leagues now provide up to four teams.[2][3] Clubs that finish next-in-line in their national league, having not qualified for the Champions League, are eligible for the second-tier UEFA Europa League competition, and from 2021, teams not eligible for the UEFA Europa League will qualify for a new third-tier competition called the UEFA Europa Conference League.[4]";
        System.out.println(Text.getNrOfSentences(text));
        System.out.println(Text.getNrOfWords(text));
        System.out.println(Text.getNrOfVowels(text));
        System.out.println(Text.getNrOfConsonants(text));
        System.out.println(Text.getMostOftenWords(text, 5));
        System.out.println(Text.getLongestWord(text));
    }
}}
