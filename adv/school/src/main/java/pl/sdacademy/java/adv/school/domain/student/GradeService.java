package pl.sdacademy.java.adv.school.domain.student;

public class GradeService {
    private final GradeRepository gradeRepository;

    public GradeService(final GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }

    public long countMathGrades() {
        return gradeRepository.findAllGrades()
                .stream()
                .filter(t -> "MAT".equals(t.getSchoolSubjectCode()))
                .count();
    }
}
