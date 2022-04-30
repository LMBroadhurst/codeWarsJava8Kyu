// Find the first non-consecutive number


class FirstNonConsecutive {
    static Integer find(final int[] array) {
        for (int i = 0; i < (array.length - 1); i++) {
          if ((array[i] + 1) == array[i + 1]) {
            continue;
          } else {
            return array[i + 1];
          }
        }
      return null;
    }
}
