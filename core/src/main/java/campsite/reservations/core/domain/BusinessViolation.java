package campsite.reservations.core.domain;

public enum BusinessViolation {
    INCONSISTENT_RESERVATION_DATES,
    MAXIMUM_RESERVATION_DURATION_EXCEEDED,
    INVALID_RESERVATION_REQUEST_PERIOD,
    CANCELLED_RESERVATION,
    UNAVAILABLE_SELECTED_PERIOD,
    RESERVATION_NOT_FOUND
}
