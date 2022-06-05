package ProgrammersLv1.코딩테스트;

class class101 {
    int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            else if (A[i] == Y)
                nY += 1;
            if (nX == nY){
                result = i;

            }
            else
                result =(result!=-1) ? result:-1;
        }
        return result;
    }

    public static void main(String[] args) {
        class101 a = new class101();
        System.out.println(a.solution(7,42,new int[]{6,42,11,7,1,42}));

    }
}
