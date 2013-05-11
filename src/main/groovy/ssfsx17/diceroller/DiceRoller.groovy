package ssfsx17.diceroller

import groovy.util.logging.Log

class DiceRoller {
    private static Random rand = new java.security.SecureRandom()
	
    static int roll(int dieSize) {
        return (rand.nextInt(dieSize) + 1)
    }
	
    static int roll(int numberOfDice, int dieSize) {
        int sum = 0
        for (i in 1..numberOfDice) {
            sum += roll(dieSize)
        }
        return sum
    }
	
    static int binary() {
        boolean result = rand.nextBoolean()
        if (result) {
            return 1
        } else {
            return 0
        }
    }
	
    static int binaryPool(int poolSize) {
        int sum = 0
        for (i in 1..poolSize) {
            sum += binary()
        }
        return sum
    }
	
}