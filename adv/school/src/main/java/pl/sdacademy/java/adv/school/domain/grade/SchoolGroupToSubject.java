package pl.sdacademy.java.adv.school.domain.grade;

import java.util.Objects;

/**
 * Klasa pomocnicza do zadania {@link GradeService#averagePerSchoolGroupAndSubjectCode()}
 * <p>
 * Wstępnie zadeklarowane metody muszą zostać, ale można (i trzeba) je uzupełnić, trzeba też będzie dodać
 * implementacje innych metod (ważnych w sytuacjach, gdy obiekt ma być używany jako klucz w mapie)
 */
public final class SchoolGroupToSubject {

    private final String schoolGroup;
    private final String subjectCode;

    public SchoolGroupToSubject(String schoolGroup, String subjectCode) {
        this.schoolGroup = schoolGroup;
        this.subjectCode = subjectCode;
    }

    public String getSchoolGroup() {
        return this.schoolGroup;
    }

    public String getSubjectCode() {
        return this.subjectCode;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        SchoolGroupToSubject that = (SchoolGroupToSubject) o;
        return Objects.equals(this.schoolGroup, that.schoolGroup) && Objects.equals(this.subjectCode, that.subjectCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.schoolGroup, this.subjectCode);
    }
}
