package homework_01;

public class Collection {
    private Integer[] array;

    public Collection(Integer[] array) {
        this.array = array;
    }

    public class Forward implements Iterator{

        private int count = 0;
        @Override
        public boolean hasNext() {
            return count<array.length;
        }


        @Override
        public Integer next() {
            if (array[count] % 2!=0) {
                array[count]=0;
            }
            return array[count++];
        }
    }
    public  Forward createdForward(){
        return new Forward();
    }

    public class Backword implements Iterator{
        private int country = array.length-1;

        @Override
        public boolean hasNext() {
                return country>1;
        }

        @Override
        public Integer next() {
                return array[country-=2];
        }
    }
    public Backword createdBackword(){
        return new Backword();
    }

    public Iterator createdAnonimus(){
        return new Iterator() {

            private int country = array.length-1;

            @Override
            public boolean hasNext() {
                return country>0;
            }

            @Override
            public Integer next() {
                return array[country--];

            }
        };
    }
    public Iterator createdclass(){
      class NumberCount implements Iterator{
            private int count = 0 ;
          @Override
          public boolean hasNext() {

              return count<array.length-12;
          }

          @Override
          public Integer next() {
              int a = 0;
              if (array[count+=5]%2 ==0){
                  a = array[count+=5]-100;
              }
              return array[count+=5];
          }
      }
      return new NumberCount();
    }

    public class CountNumber implements Iterator{
        private int count = 0;
        int a = 0 ;
        @Override
        public boolean hasNext() {
            return count<array.length;
        }
        @Override
        public Integer next() {
            if (array[count++]%2==0){
                a=array[count++];
            }
            return a;

        }
    }
    public CountNumber createdCountNumber(){
     return new CountNumber();
    }
}
