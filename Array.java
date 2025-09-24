class Array{
        private int arr[];
        private int cap;
        private int s;
        //decleraing an array

        public Array(int cap){
                this.cap=cap;
                arr=new int[cap];
                s=0;
        }
        //hey added
        //getting the array element
        public int get(int index){
                if(index<0 || index>=s){
                        System.out.println("we cant find the index");
                        return -1;
                }
                return arr[index];
        }

        //inserting the array element
        public int insert(int index, int value){
                if(index < 0 || index > s || s >= cap){
                        System.out.println("insertion not possible");
                        return -1;
                }
                for(int i=s-1;i>=index;i--){
                        arr[i+1]=arr[i];
                }
                arr[index]=value;
                s++;
                return 1;
        }

        //deleting the element in an array
        public int delete(int index){
                if(index<0 || index>=s){
                        System.out.println("delteing is't possible");
                        return -1;
                }
                for(int i=index+1 ;i<s;i++){
                        arr[i-1]=arr[i];
                }
                s--;
                return 1;
        }

        //updating
        public int update(int index,int value){
                if(index<0 || index>=s || index>cap){
                        System.out.println("updating is not possible");
                        return -1;
                }
                arr[index]=value;
                return 1;
        }

        // searching
        public int search(int value){
                for(int i=0;i<s;i++){
                        if(arr[i]==value){
                                System.out.println("value found in the index "+i);
                                return 1;
                        }
                }
                return -1;
        }

        // get size
        public int getsize(){
                return s;
        }

        //get capacity
        public int getcapacity(){
                return cap;
        }
        // display array
        public void display(){
                for (int i=0; i<s;i++){
                        System.out.println(arr[i]);
                }
        }
        //adding to git hub
        public static void main(String[] args){
                Array arr=new Array(5);
                arr.insert(0,10);
                arr.insert(1,20);
                arr.insert(2,30);
                arr.insert(3,40);
                arr.insert(4,50);

                System.out.println(arr.get(3));
               
        }
}
