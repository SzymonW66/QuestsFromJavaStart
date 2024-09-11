package Chapter39.lectures.lec3;

import Chapter39.lectures.lec2.Course;

import java.util.Objects;

public class Course1 {

        private Long id;
        private String name;
        private double pricing;
        private String category;

        public Course1(Long id, String name, double pricing, String category) {
            this.id = id;
            this.name = name;
            this.pricing = pricing;
            this.category = category;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPricing() {
            return pricing;
        }

        public void setPricing(double pricing) {
            this.pricing = pricing;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        @Override
        public String toString() {
            return "Course{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", pricing=" + pricing +
                    ", category='" + category + '\'' +
                    '}';
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course1 course1)) return false;
        return Double.compare(pricing, course1.pricing) == 0 && Objects.equals(id, course1.id) && Objects.equals(name, course1.name) && Objects.equals(category, course1.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pricing, category);
    }
}
