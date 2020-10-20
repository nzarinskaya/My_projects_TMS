package hw_21_10_2020.letter;

public enum LetterPosition {
    NULL, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;
    int getLetterPosition() {
        return ordinal();
    }
}
