package guru.springframework.fizzery.web.model;

import java.util.UUID;

public class CustomerDto {
    private UUID id;
    private String name;

    public CustomerDto(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public CustomerDto() {
    }

    public static CustomerDtoBuilder builder() {
        return new CustomerDtoBuilder();
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CustomerDto)) return false;
        final CustomerDto other = (CustomerDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CustomerDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        return "CustomerDto(id=" + this.getId() + ", name=" + this.getName() + ")";
    }

    public static class CustomerDtoBuilder {
        private UUID id;
        private String name;

        CustomerDtoBuilder() {
        }

        public CustomerDtoBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public CustomerDtoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CustomerDto build() {
            return new CustomerDto(this.id, this.name);
        }

        public String toString() {
            return "CustomerDto.CustomerDtoBuilder(id=" + this.id + ", name=" + this.name + ")";
        }
    }
}
