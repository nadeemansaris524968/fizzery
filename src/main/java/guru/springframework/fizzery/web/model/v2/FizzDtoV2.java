package guru.springframework.fizzery.web.model.v2;

import java.util.UUID;

public class FizzDtoV2 {
    private UUID id;
    private String fizzName;
    private FizzStyleEnum fizzStyle;
    private Long upc;

    public FizzDtoV2(UUID id, String fizzName, FizzStyleEnum fizzStyle, Long upc) {
        this.id = id;
        this.fizzName = fizzName;
        this.fizzStyle = fizzStyle;
        this.upc = upc;
    }

    public FizzDtoV2() {
    }

    public static FizzDtoV2Builder builder() {
        return new FizzDtoV2Builder();
    }

    public UUID getId() {
        return this.id;
    }

    public String getFizzName() {
        return this.fizzName;
    }

    public FizzStyleEnum getFizzStyle() {
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

    public void setFizzStyle(FizzStyleEnum fizzStyle) {
        this.fizzStyle = fizzStyle;
    }

    public void setUpc(Long upc) {
        this.upc = upc;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FizzDtoV2)) return false;
        final FizzDtoV2 other = (FizzDtoV2) o;
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
        return other instanceof FizzDtoV2;
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
        return "FizzDtoV2(id=" + this.getId() + ", fizzName=" + this.getFizzName() + ", fizzStyle=" + this.getFizzStyle() + ", upc=" + this.getUpc() + ")";
    }

    public static class FizzDtoV2Builder {
        private UUID id;
        private String fizzName;
        private FizzStyleEnum fizzStyle;
        private Long upc;

        FizzDtoV2Builder() {
        }

        public FizzDtoV2Builder id(UUID id) {
            this.id = id;
            return this;
        }

        public FizzDtoV2Builder fizzName(String fizzName) {
            this.fizzName = fizzName;
            return this;
        }

        public FizzDtoV2Builder fizzStyle(FizzStyleEnum fizzStyle) {
            this.fizzStyle = fizzStyle;
            return this;
        }

        public FizzDtoV2Builder upc(Long upc) {
            this.upc = upc;
            return this;
        }

        public FizzDtoV2 build() {
            return new FizzDtoV2(this.id, this.fizzName, this.fizzStyle, this.upc);
        }

        public String toString() {
            return "FizzDtoV2.FizzDtoV2Builder(id=" + this.id + ", fizzName=" + this.fizzName + ", fizzStyle=" + this.fizzStyle + ", upc=" + this.upc + ")";
        }
    }
}
