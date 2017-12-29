import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class JavaJava {

    public void is() {
        System.out.println(JavaJava.class.getName());
    }

    public List<String> getList() {
        return new ArrayList<>();
    }

    public List<String> getUnmodifiableList() {
        return Collections.unmodifiableList(new ArrayList<>());
    }

    public List<String> getImmutableList() {
        return Collections.unmodifiableList(new ArrayList<>());
    }

    public List<String> getMutableList() {
        return new ArrayList<>();
    }

    public void arguments(int... ints) {
    }

    @Nullable
    public String getNullableObject() {
        return null;
    }

    @NotNull
    public String getNotNullableObject() {
        return "not null";
    }

    public Optional<String> getStringOptional() {
        return Optional.empty();
    }
}
