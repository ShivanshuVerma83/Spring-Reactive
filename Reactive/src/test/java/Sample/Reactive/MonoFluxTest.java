package Sample.Reactive;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;
import org.junit.jupiter.api.Test;
public class MonoFluxTest {
    @Test
    public void testMono(){
        Mono<?> monoString = Mono.just("Shivanshu")
                .then(Mono.error(new RuntimeException("Exception occured")))
                .log();
        monoString.subscribe(System.out::println,(e)->System.out.println(e.getMessage()));
    }
    @Test

    public void testflux(){
        Flux<String> fluxString = Flux.just("mkc","bkl","jahan").log();

        fluxString.subscribe(System.out::println,(e)->System.out.println(e.getMessage()));
    }
}


