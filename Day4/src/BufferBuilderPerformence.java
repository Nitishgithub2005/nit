public class BufferBuilderPerformence {
    public static void main(String[] args) {
        //builder is more efficient
        long stime =System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("BIET");
        for(int i=1;i<100000000;i++){
            buffer.append("College");
        }
        System.out.println("Buffer Time: " + (System.currentTimeMillis()-stime)+"ms");

        stime=System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("BIET");
        for(int i=1;i<100000000;i++){
            builder.append("College");
        }
        System.out.println("builder time "+(System.currentTimeMillis()-stime)+ "ms");
    }
}
