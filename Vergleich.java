public interface Vergleich {
    long fkt (long x, long y);
    Vergleich v = (x, y) -> x - y;
}
