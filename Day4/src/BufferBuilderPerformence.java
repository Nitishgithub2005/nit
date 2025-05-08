public class BufferBuilderPerformence {
    public static void main(String[] args) {
        //builder is more efficient
        //string builder is more effienct whenwe have larger manipulation and it is also thread safe.
        //it can run independently in any "thread" -> the smallest unit of procesing
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
