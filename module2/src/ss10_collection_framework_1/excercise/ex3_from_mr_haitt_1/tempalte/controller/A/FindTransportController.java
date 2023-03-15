package ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.controller.A;

import ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.service.impl.C.TransportService;

public class FindTransportController {
    private static TransportService transportService = new TransportService();

    public static void findTransport() {
        transportService.findTransport();
    }
}
