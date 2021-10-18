package se.lexicon.sequencer;

public class BankAccountSequencer {
    private static int accountNumber;

    public static int nextAccountNumber(){
        return ++accountNumber;
    }
}
