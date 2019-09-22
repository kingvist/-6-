/**编写一个类Computer，类中含有一个求n的阶乘的方法。
 * 将该类打包，并在另一包中的Java文件App.java中引入包，
 * 在主类中定义Computer类的对象，调用求n的阶乘的方法
 * （n值由参数决定），并将结果输出。
 */
package HomeWork6Day1_1;
public class HomeWork6Day1_1 {
    static int k=1;    
    public static int Factorial (int n) {
        for(int i=1;i<=n;i++)
        {
            k*=i;            
        }                
        return k;    
    }

}
