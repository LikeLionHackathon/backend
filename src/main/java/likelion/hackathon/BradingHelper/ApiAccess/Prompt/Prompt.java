package likelion.hackathon.BradingHelper.ApiAccess.Prompt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Prompt {
    private String brandName;
    private Category category;
    private List<String> hashtag;
    private Option option;
    private String description;

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Category {
        private String parentCategory;
        private String childCategory;
    }

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Option {
        private String mood;
        private String baseColor;
        private String object;
    }
}