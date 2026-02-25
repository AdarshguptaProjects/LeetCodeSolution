class Solution {
    public int[] sortByBits(int[] arr) {
        arr = Arrays.stream(arr)
            .boxed()
            .sorted((a, b) -> {
                int aBit = Integer.bitCount(a);
                int bBit = Integer.bitCount(b);

                if (aBit == bBit)
                    return a - b;

                return aBit - bBit;
            })
            .mapToInt(Integer::intValue)
            .toArray();

    return arr;
    }

}
