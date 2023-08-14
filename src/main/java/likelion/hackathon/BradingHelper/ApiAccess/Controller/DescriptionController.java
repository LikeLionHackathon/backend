package likelion.hackathon.BradingHelper.ApiAccess.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import likelion.hackathon.BradingHelper.ApiAccess.Description.DescriptionApi;
import likelion.hackathon.BradingHelper.ApiAccess.Description.DescriptionPreprocessor;
import likelion.hackathon.BradingHelper.ApiAccess.Prompt.Prompt;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(name = "설명 생성 API")
public class DescriptionController {

    private final DescriptionPreprocessor descriptionPreprocessor;

    @Operation(summary = "설명 생성하기", description = "프롬프트에서 키워드를 추출해 적절한 설명을 가져옵니다.")
    @PostMapping("/description")
    public DescriptionApi DescriptionApi(@RequestBody Prompt prompt){
        return descriptionPreprocessor.descriptionPreprocessor(prompt);
    }
}
