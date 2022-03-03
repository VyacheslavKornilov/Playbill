package ru.netology.domain;


public class Manager {
    private int defaultLength;

    public Manager(int defaultLength, Playbill[] moves) {
        this.defaultLength = defaultLength;
        this.moves = moves;
    }

    public Manager() {
        this.defaultLength = 10;
    }

    private Playbill[] moves = new Playbill[0];

    public void add(Playbill newMoves) {
        Playbill[] tmp = new Playbill[moves.length + 1];
        System.arraycopy(moves, 0, tmp, 0, moves.length);
        tmp[tmp.length - 1] = newMoves;
        this.moves = tmp;
    }

    public Playbill[] findAll() {
        return moves;
    }

    public Playbill[] findLast() {
        int resultLength;
        if (defaultLength < moves.length) {
            resultLength = defaultLength;
        } else {
            resultLength = moves.length;
        }
        Playbill[] tmp = new Playbill[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = moves[moves.length - 1 - i];
        }
        return tmp;
    }
}

