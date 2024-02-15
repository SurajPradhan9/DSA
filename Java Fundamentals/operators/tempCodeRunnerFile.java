 // Assignment Q5-----DOUBT
        System.out.println("Enter s value:");
        int s=sc.nextInt();
        System.out.println("Enter v value:");
        int v=sc.nextInt();
        int num=s^v;
        int count=0;
        while(num!=0){
        num=num&num-1;
        System.out.println("num:"+num);
        count++;
        }
        System.out.println("count:"+count);