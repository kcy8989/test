package com.itwill.test.member;


import com.itwill.test.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

  private final MemberService memberService;

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("members", memberService.findAll());
    return "index";
  }

}
