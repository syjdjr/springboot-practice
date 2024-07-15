package com.hello.core.member;

public class MemberServiceImpl implements MemberService{

    //생성자 주입을 통해 MemberRepository 인터페이스에만 의존하도록 변경
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
