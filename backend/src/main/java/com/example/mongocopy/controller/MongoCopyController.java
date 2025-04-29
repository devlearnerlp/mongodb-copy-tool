@RestController
@RequestMapping("/api/copy")
public class MongoCopyController {
    @Autowired
    private MongoCopyService mongoCopyService;

    @PostMapping("/start")
    public ResponseEntity<String> startJob(@RequestBody CopyJobRequest request) {
        String jobId = mongoCopyService.startCopyJob(request);
        return ResponseEntity.ok(jobId);
    }

    @GetMapping("/status/{jobId}")
    public ResponseEntity<CopyJob> getStatus(@PathVariable String jobId) {
        return ResponseEntity.ok(mongoCopyService.getJobStatus(jobId));
    }

    @PostMapping("/pause/{jobId}")
    public void pauseJob(@PathVariable String jobId) {
        mongoCopyService.pauseJob(jobId);
    }

    @PostMapping("/resume/{jobId}")
    public void resumeJob(@PathVariable String jobId) {
        mongoCopyService.resumeJob(jobId);
    }

    @PostMapping("/cancel/{jobId}")
    public void cancelJob(@PathVariable String jobId) {
        mongoCopyService.cancelJob(jobId);
    }

    @GetMapping("/logs/{jobId}")
    public ResponseEntity<String> getLogs(@PathVariable String jobId) {
        return ResponseEntity.ok(mongoCopyService.getJobLogs(jobId));
    }
}
