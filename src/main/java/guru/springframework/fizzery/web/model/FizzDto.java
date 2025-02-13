package guru.springframework.fizzery.web.model;

import java.util.UUID;

public class FizzDto {
    private UUID id;
    private String fizzName;
    private String fizzStyle;
    private Long upc;

    public FizzDto(UUID id, String fizzName, String fizzStyle, Long upc) {
        this.id = id;
        this.fizzName = fizzName;
        this.fizzStyle = fizzStyle;
        this.upc = upc;
    }

    public FizzDto() {
    }

    public static FizzDtoBuilder builder() {
        return new FizzDtoBuilder();
    }

    public UUID getId() {
        return this.id;
    }

    public String getFizzName() {
        return this.fizzName;
    }

    public String getFizzStyle() {
        return this.fizzStyle;
    }

    public Long getUpc() {
        return this.upc;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setFizzName(String fizzName) {
        this.fizzName = fizzName;
    }

    public void setFizzStyle(String fizzStyle) {
        this.fizzStyle = fizzStyle;
    }

    public void setUpc(Long upc) {
        this.upc = upc;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FizzDto)) return false;
        final FizzDto other = (FizzDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$fizzName = this.getFizzName();
        final Object other$fizzName = other.getFizzName();
        if (this$fizzName == null ? other$fizzName != null : !this$fizzName.equals(other$fizzName)) return false;
        final Object this$fizzStyle = this.getFizzStyle();
        final Object other$fizzStyle = other.getFizzStyle();
        if (this$fizzStyle == null ? other$fizzStyle != null : !this$fizzStyle.equals(other$fizzStyle)) return false;
        final Object this$upc = this.getUpc();
        final Object other$upc = other.getUpc();
        if (this$upc == null ? other$upc != null : !this$upc.equals(other$upc)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FizzDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $fizzName = this.getFizzName();
        result = result * PRIME + ($fizzName == null ? 43 : $fizzName.hashCode());
        final Object $fizzStyle = this.getFizzStyle();
        result = result * PRIME + ($fizzStyle == null ? 43 : $fizzStyle.hashCode());
        final Object $upc = this.getUpc();
        result = result * PRIME + ($upc == null ? 43 : $upc.hashCode());
        return result;
    }

    public String toString() {
        return "FizzDto(id=" + this.getId() + ", fizzName=" + this.getFizzName() + ", fizzStyle=" + this.getFizzStyle() + ", upc=" + this.getUpc() + ")";
    }

    public static class FizzDtoBuilder {
        private UUID id;
        private String fizzName;
        private String fizzStyle;
        private Long upc;

        FizzDtoBuilder() {
        }

        public FizzDtoBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public FizzDtoBuilder fizzName(String fizzName) {
            this.fizzName = fizzName;
            return this;
        }

        public FizzDtoBuilder fizzStyle(String fizzStyle) {
            this.fizzStyle = fizzStyle;
            return this;
        }

        public FizzDtoBuilder upc(Long upc) {
            this.upc = upc;
            return this;
        }

        public FizzDto build() {
            return new FizzDto(this.id, this.fizzName, this.fizzStyle, this.upc);
        }

        public String toString() {
            return "FizzDto.FizzDtoBuilder(id=" + this.id + ", fizzName=" + this.fizzName + ", fizzStyle=" + this.fizzStyle + ", upc=" + this.upc + ")";
        }
    }
}
