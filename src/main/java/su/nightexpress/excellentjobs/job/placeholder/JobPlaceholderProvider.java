package su.nightexpress.excellentjobs.job.placeholder;

import java.util.stream.Collectors;

import org.jspecify.annotations.NullMarked;

import su.nightexpress.excellentjobs.job.JobManager;
import su.nightexpress.excellentjobs.job.core.JobLang;
import su.nightexpress.excellentjobs.job.model.Job;
import su.nightexpress.nightcore.bridge.placeholder.PlaceholderProvider;
import su.nightexpress.nightcore.bridge.placeholder.PlaceholderRegistry;
import su.nightexpress.nightcore.util.NumberUtil;

@NullMarked
public class JobPlaceholderProvider implements PlaceholderProvider {

    private final JobManager manager;

    public JobPlaceholderProvider(JobManager manager) {
        this.manager = manager;
    }

    @Override
    public void addPlaceholders(PlaceholderRegistry registry) {
        registry.registerRaw("active_jobs", (player, payload) -> {
            return String.valueOf(this.manager.countActiveJobs(player));
        });

        registry.registerRaw("active_job_names", (player, payload) -> {
            String delimiter = JobLang.PLACEHOLDER_JOB_NAMES_DELIMITER.text();
            return this.manager.getActiveJobs(player).stream()
                .map(data -> data.job().getName())
                .collect(Collectors.joining(delimiter));
        });

        registry.registerRaw("available_jobs", (player, payload) -> {
            return String.valueOf(this.manager.countAvailableJobs(player));
        });

        registry.registerRaw("max_available_jobs", (player, payload) -> {
            return String.valueOf(this.manager.getJobsLimit(player));
        });

        registry.registerMapped("employees", Job.class, (player, job) -> {
            return NumberUtil.format(job.getEmployees());
        });
    }
}
