public interface Consumer <T extends Human>{
    default void accept(T t){
        System.out.println(t.getName());
    }
}
